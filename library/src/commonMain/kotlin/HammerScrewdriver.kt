package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HammerScrewdriver: ImageVector
    get() {
        if (_HammerScrewdriver != null) {
            return _HammerScrewdriver!!
        }
        _HammerScrewdriver = ImageVector.Builder(
            name = "HammerScrewdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.06f, 13.09f)
                lineTo(21.69f, 18.68f)
                lineTo(18.37f, 21.96f)
                lineTo(12.78f, 16.37f)
                verticalLineTo(15.45f)
                lineTo(15.14f, 13.09f)
                horizontalLineTo(16.06f)
                moveTo(16.97f, 10.56f)
                lineTo(16f, 9.6f)
                lineTo(11.21f, 14.4f)
                verticalLineTo(16.37f)
                lineTo(5.58f, 22f)
                lineTo(2.3f, 18.68f)
                lineTo(7.89f, 13.09f)
                horizontalLineTo(9.86f)
                lineTo(10.64f, 12.31f)
                lineTo(6.8f, 8.46f)
                horizontalLineTo(5.5f)
                lineTo(2.69f, 5.62f)
                lineTo(5.31f, 3f)
                lineTo(8.11f, 5.8f)
                verticalLineTo(7.11f)
                lineTo(12f, 10.95f)
                lineTo(14.66f, 8.29f)
                lineTo(13.7f, 7.28f)
                lineTo(15f, 5.97f)
                horizontalLineTo(12.34f)
                lineTo(11.69f, 5.32f)
                lineTo(15f, 2f)
                lineTo(15.66f, 2.66f)
                verticalLineTo(5.32f)
                lineTo(16.97f, 4f)
                lineTo(20.25f, 7.28f)
                curveTo(21.34f, 8.38f, 21.34f, 10.17f, 20.25f, 11.26f)
                lineTo(18.28f, 9.25f)
                lineTo(16.97f, 10.56f)
                close()
            }
        }.build()

        return _HammerScrewdriver!!
    }

@Suppress("ObjectPropertyName")
private var _HammerScrewdriver: ImageVector? = null
