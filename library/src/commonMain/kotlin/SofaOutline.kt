package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SofaOutline: ImageVector
    get() {
        if (_SofaOutline != null) {
            return _SofaOutline!!
        }
        _SofaOutline = ImageVector.Builder(
            name = "SofaOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                verticalLineTo(7f)
                curveTo(21f, 5.35f, 19.65f, 4f, 18f, 4f)
                horizontalLineTo(14f)
                curveTo(13.23f, 4f, 12.53f, 4.3f, 12f, 4.78f)
                curveTo(11.47f, 4.3f, 10.77f, 4f, 10f, 4f)
                horizontalLineTo(6f)
                curveTo(4.35f, 4f, 3f, 5.35f, 3f, 7f)
                verticalLineTo(9f)
                curveTo(1.35f, 9f, 0f, 10.35f, 0f, 12f)
                verticalLineTo(17f)
                curveTo(0f, 18.65f, 1.35f, 20f, 3f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                curveTo(22.65f, 20f, 24f, 18.65f, 24f, 17f)
                verticalLineTo(12f)
                curveTo(24f, 10.35f, 22.65f, 9f, 21f, 9f)
                moveTo(14f, 6f)
                horizontalLineTo(18f)
                curveTo(18.55f, 6f, 19f, 6.45f, 19f, 7f)
                verticalLineTo(9.78f)
                curveTo(18.39f, 10.33f, 18f, 11.12f, 18f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                curveTo(13f, 6.45f, 13.45f, 6f, 14f, 6f)
                moveTo(5f, 7f)
                curveTo(5f, 6.45f, 5.45f, 6f, 6f, 6f)
                horizontalLineTo(10f)
                curveTo(10.55f, 6f, 11f, 6.45f, 11f, 7f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                curveTo(6f, 11.12f, 5.61f, 10.33f, 5f, 9.78f)
                verticalLineTo(7f)
                moveTo(22f, 17f)
                curveTo(22f, 17.55f, 21.55f, 18f, 21f, 18f)
                horizontalLineTo(3f)
                curveTo(2.45f, 18f, 2f, 17.55f, 2f, 17f)
                verticalLineTo(12f)
                curveTo(2f, 11.45f, 2.45f, 11f, 3f, 11f)
                reflectiveCurveTo(4f, 11.45f, 4f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                curveTo(20f, 11.45f, 20.45f, 11f, 21f, 11f)
                reflectiveCurveTo(22f, 11.45f, 22f, 12f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _SofaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SofaOutline: ImageVector? = null
