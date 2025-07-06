package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountFilterOutline: ImageVector
    get() {
        if (_AccountFilterOutline != null) {
            return _AccountFilterOutline!!
        }
        _AccountFilterOutline = ImageVector.Builder(
            name = "AccountFilterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20f, 22.87f, 20f, 22.28f)
                verticalLineTo(18f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13f, 22f, 13f)
                horizontalLineTo(15f)
                curveTo(14.2f, 13f, 13.7f, 14f, 14.2f, 14.6f)
                lineTo(17f, 18f)
                verticalLineTo(21f)
                moveTo(15f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.3f, 7.3f, 13f, 10f, 13f)
                curveTo(10.6f, 13f, 11.3f, 13.1f, 12.1f, 13.2f)
                curveTo(11.9f, 13.8f, 12f, 14.5f, 12.2f, 15.1f)
                curveTo(11.5f, 15f, 10.7f, 14.9f, 10f, 14.9f)
                curveTo(7f, 14.9f, 3.9f, 16.4f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(14.5f)
                lineTo(15f, 18.7f)
                verticalLineTo(20f)
                moveTo(10f, 4f)
                curveTo(7.8f, 4f, 6f, 5.8f, 6f, 8f)
                reflectiveCurveTo(7.8f, 12f, 10f, 12f)
                reflectiveCurveTo(14f, 10.2f, 14f, 8f)
                reflectiveCurveTo(12.2f, 4f, 10f, 4f)
                moveTo(10f, 10f)
                curveTo(8.9f, 10f, 8f, 9.1f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                reflectiveCurveTo(12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.1f, 10f, 10f, 10f)
                close()
            }
        }.build()

        return _AccountFilterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountFilterOutline: ImageVector? = null
