package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SofaSingleOutline: ImageVector
    get() {
        if (_SofaSingleOutline != null) {
            return _SofaSingleOutline!!
        }
        _SofaSingleOutline = ImageVector.Builder(
            name = "SofaSingleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                verticalLineTo(7f)
                curveTo(19f, 5.35f, 17.65f, 4f, 16f, 4f)
                horizontalLineTo(8f)
                curveTo(6.35f, 4f, 5f, 5.35f, 5f, 7f)
                verticalLineTo(9f)
                curveTo(3.35f, 9f, 2f, 10.35f, 2f, 12f)
                verticalLineTo(17f)
                curveTo(2f, 18.65f, 3.35f, 20f, 5f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                curveTo(20.65f, 20f, 22f, 18.65f, 22f, 17f)
                verticalLineTo(12f)
                curveTo(22f, 10.35f, 20.65f, 9f, 19f, 9f)
                moveTo(7f, 7f)
                curveTo(7f, 6.45f, 7.45f, 6f, 8f, 6f)
                horizontalLineTo(16f)
                curveTo(16.55f, 6f, 17f, 6.45f, 17f, 7f)
                verticalLineTo(9.78f)
                curveTo(16.39f, 10.33f, 16f, 11.12f, 16f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                curveTo(8f, 11.12f, 7.61f, 10.33f, 7f, 9.78f)
                verticalLineTo(7f)
                moveTo(20f, 17f)
                curveTo(20f, 17.55f, 19.55f, 18f, 19f, 18f)
                horizontalLineTo(5f)
                curveTo(4.45f, 18f, 4f, 17.55f, 4f, 17f)
                verticalLineTo(12f)
                curveTo(4f, 11.45f, 4.45f, 11f, 5f, 11f)
                reflectiveCurveTo(6f, 11.45f, 6f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(18f, 11.45f, 18.45f, 11f, 19f, 11f)
                reflectiveCurveTo(20f, 11.45f, 20f, 12f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _SofaSingleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SofaSingleOutline: ImageVector? = null
