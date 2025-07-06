package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCardOutline: ImageVector
    get() {
        if (_AccountCardOutline != null) {
            return _AccountCardOutline!!
        }
        _AccountCardOutline = ImageVector.Builder(
            name = "AccountCardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 4f)
                curveTo(4.8f, 4f, 3f, 5.8f, 3f, 8f)
                reflectiveCurveTo(4.8f, 12f, 7f, 12f)
                reflectiveCurveTo(11f, 10.2f, 11f, 8f)
                reflectiveCurveTo(9.2f, 4f, 7f, 4f)
                moveTo(7f, 10f)
                curveTo(5.9f, 10f, 5f, 9.1f, 5f, 8f)
                reflectiveCurveTo(5.9f, 6f, 7f, 6f)
                reflectiveCurveTo(9f, 6.9f, 9f, 8f)
                reflectiveCurveTo(8.1f, 10f, 7f, 10f)
                moveTo(0f, 18f)
                curveTo(0f, 15.8f, 3.1f, 14f, 7f, 14f)
                curveTo(8.5f, 14f, 9.9f, 14.3f, 11f, 14.7f)
                verticalLineTo(17f)
                curveTo(10.2f, 16.5f, 8.8f, 16f, 7f, 16f)
                curveTo(3.8f, 16f, 2f, 17.4f, 2f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                moveTo(22f, 4f)
                horizontalLineTo(15f)
                curveTo(13.9f, 4f, 13f, 4.9f, 13f, 6f)
                verticalLineTo(18f)
                curveTo(13f, 19.1f, 13.9f, 20f, 15f, 20f)
                horizontalLineTo(22f)
                curveTo(23.1f, 20f, 24f, 19.1f, 24f, 18f)
                verticalLineTo(6f)
                curveTo(24f, 4.9f, 23.1f, 4f, 22f, 4f)
                moveTo(22f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _AccountCardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCardOutline: ImageVector? = null
