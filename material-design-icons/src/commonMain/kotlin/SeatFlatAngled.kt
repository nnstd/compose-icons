package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeatFlatAngled: ImageVector
    get() {
        if (_SeatFlatAngled != null) {
            return _SeatFlatAngled!!
        }
        _SeatFlatAngled = ImageVector.Builder(
            name = "SeatFlatAngled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.25f, 14.29f)
                lineTo(21.56f, 16.18f)
                lineTo(9.2f, 11.71f)
                lineTo(11.28f, 6.05f)
                lineTo(19.84f, 9.14f)
                curveTo(21.94f, 9.9f, 23f, 12.2f, 22.25f, 14.29f)
                moveTo(1.5f, 12.14f)
                lineTo(8f, 14.5f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17.37f)
                lineTo(20.5f, 19f)
                lineTo(21.21f, 17.11f)
                lineTo(2.19f, 10.25f)
                moveTo(7.3f, 10.2f)
                curveTo(8.79f, 9.5f, 9.42f, 7.69f, 8.71f, 6.2f)
                curveTo(8f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f)
                curveTo(3.21f, 5.5f, 2.58f, 7.3f, 3.3f, 8.8f)
                curveTo(4f, 10.29f, 5.8f, 10.92f, 7.3f, 10.2f)
                close()
            }
        }.build()

        return _SeatFlatAngled!!
    }

@Suppress("ObjectPropertyName")
private var _SeatFlatAngled: ImageVector? = null
