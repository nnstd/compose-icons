package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BowArrow: ImageVector
    get() {
        if (_BowArrow != null) {
            return _BowArrow!!
        }
        _BowArrow = ImageVector.Builder(
            name = "BowArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.03f, 6.03f)
                lineTo(20f, 7f)
                lineTo(22f, 2f)
                lineTo(17f, 4f)
                lineTo(17.97f, 4.97f)
                lineTo(16.15f, 6.79f)
                curveTo(10.87f, 2.16f, 3.3f, 3.94f, 2.97f, 4f)
                lineTo(2f, 4.26f)
                lineTo(2.5f, 6.2f)
                lineTo(3.29f, 6f)
                lineTo(10.12f, 12.82f)
                lineTo(6.94f, 16f)
                horizontalLineTo(5f)
                lineTo(2f, 19f)
                lineTo(4f, 20f)
                lineTo(5f, 22f)
                lineTo(8f, 19f)
                verticalLineTo(17.06f)
                lineTo(11.18f, 13.88f)
                lineTo(18f, 20.71f)
                lineTo(17.81f, 21.5f)
                lineTo(19.74f, 22f)
                lineTo(20f, 21.03f)
                curveTo(20.06f, 20.7f, 21.84f, 13.13f, 17.21f, 7.85f)
                lineTo(19.03f, 6.03f)
                moveTo(4.5f, 5.78f)
                curveTo(6.55f, 5.5f, 11.28f, 5.28f, 14.73f, 8.21f)
                lineTo(10.82f, 12.12f)
                lineTo(4.5f, 5.78f)
                moveTo(18.22f, 19.5f)
                lineTo(11.88f, 13.18f)
                lineTo(15.79f, 9.27f)
                curveTo(18.72f, 12.72f, 18.5f, 17.45f, 18.22f, 19.5f)
                close()
            }
        }.build()

        return _BowArrow!!
    }

@Suppress("ObjectPropertyName")
private var _BowArrow: ImageVector? = null
