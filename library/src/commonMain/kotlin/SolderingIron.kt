package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolderingIron: ImageVector
    get() {
        if (_SolderingIron != null) {
            return _SolderingIron!!
        }
        _SolderingIron = ImageVector.Builder(
            name = "SolderingIron",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.86f, 4.03f)
                lineTo(2.03f, 6.86f)
                lineTo(5.21f, 10.04f)
                verticalLineTo(12.87f)
                lineTo(6.63f, 14.28f)
                lineTo(12.28f, 8.63f)
                lineTo(10.87f, 7.21f)
                horizontalLineTo(8.04f)
                lineTo(4.86f, 4.03f)
                moveTo(17f, 6f)
                verticalLineTo(7.5f)
                curveTo(18f, 7.5f, 18.85f, 8.33f, 18.85f, 9.35f)
                curveTo(18.85f, 10.37f, 18f, 11.2f, 17f, 11.2f)
                verticalLineTo(12.7f)
                curveTo(19.24f, 12.7f, 21f, 14.53f, 21f, 16.77f)
                verticalLineTo(21f)
                horizontalLineTo(22.5f)
                verticalLineTo(16.76f)
                curveTo(22.5f, 14.54f, 21.22f, 12.62f, 19.35f, 11.73f)
                curveTo(19.97f, 11.12f, 20.35f, 10.28f, 20.35f, 9.35f)
                curveTo(20.35f, 7.5f, 18.85f, 6f, 17f, 6f)
                moveTo(11.93f, 11.1f)
                lineTo(9.1f, 13.93f)
                lineTo(14.05f, 18.88f)
                lineTo(14.76f, 18.17f)
                lineTo(16.88f, 20.29f)
                lineTo(19f, 21f)
                lineTo(18.29f, 18.88f)
                lineTo(16.17f, 16.76f)
                lineTo(16.88f, 16.05f)
                lineTo(11.93f, 11.1f)
                close()
            }
        }.build()

        return _SolderingIron!!
    }

@Suppress("ObjectPropertyName")
private var _SolderingIron: ImageVector? = null
