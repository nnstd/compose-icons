package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountWrenchOutline: ImageVector
    get() {
        if (_AccountWrenchOutline != null) {
            return _AccountWrenchOutline!!
        }
        _AccountWrenchOutline = ImageVector.Builder(
            name = "AccountWrenchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.9f, 21.2f)
                lineTo(18.8f, 17.1f)
                curveTo(19.2f, 16.1f, 19f, 14.8f, 18.1f, 14f)
                curveTo(17.2f, 13.1f, 15.9f, 12.9f, 14.8f, 13.4f)
                lineTo(16.7f, 15.3f)
                lineTo(15.3f, 16.7f)
                lineTo(13.3f, 14.7f)
                curveTo(12.8f, 15.8f, 13f, 17.1f, 13.9f, 18.1f)
                curveTo(14.8f, 19f, 16f, 19.2f, 17f, 18.8f)
                lineTo(21.1f, 22.9f)
                curveTo(21.3f, 23.1f, 21.6f, 23.1f, 21.7f, 22.9f)
                lineTo(22.7f, 21.9f)
                curveTo(23f, 21.6f, 23f, 21.3f, 22.9f, 21.2f)
                moveTo(10f, 12f)
                curveTo(12.2f, 12f, 14f, 10.2f, 14f, 8f)
                reflectiveCurveTo(12.2f, 4f, 10f, 4f)
                reflectiveCurveTo(6f, 5.8f, 6f, 8f)
                reflectiveCurveTo(7.8f, 12f, 10f, 12f)
                moveTo(10f, 6f)
                curveTo(11.1f, 6f, 12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.1f, 10f, 10f, 10f)
                reflectiveCurveTo(8f, 9.1f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                moveTo(13f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.3f, 7.3f, 13f, 10f, 13f)
                curveTo(10.5f, 13f, 11.2f, 13.1f, 11.9f, 13.2f)
                curveTo(11.5f, 13.7f, 11.3f, 14.3f, 11.1f, 15f)
                curveTo(10.7f, 15f, 10.4f, 14.9f, 10f, 14.9f)
                curveTo(7f, 14.9f, 3.9f, 16.4f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 18.9f, 12.4f, 19.5f, 13f, 20f)
                close()
            }
        }.build()

        return _AccountWrenchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountWrenchOutline: ImageVector? = null
