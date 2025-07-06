package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeafMaple: ImageVector
    get() {
        if (_LeafMaple != null) {
            return _LeafMaple!!
        }
        _LeafMaple = ImageVector.Builder(
            name = "LeafMaple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.79f, 13f)
                lineTo(16f, 16f)
                lineTo(17f, 18f)
                lineTo(13f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17.25f)
                lineTo(7f, 18f)
                lineTo(8f, 16f)
                lineTo(2.21f, 13f)
                lineTo(3.21f, 11.27f)
                lineTo(1.61f, 8f)
                lineTo(5.21f, 7.77f)
                lineTo(6.21f, 6f)
                lineTo(9.63f, 9.9f)
                lineTo(8f, 5f)
                horizontalLineTo(10f)
                lineTo(12f, 2f)
                lineTo(14f, 5f)
                horizontalLineTo(16f)
                lineTo(14.37f, 9.9f)
                lineTo(17.79f, 6f)
                lineTo(18.79f, 7.73f)
                lineTo(22.39f, 7.96f)
                lineTo(20.79f, 11.19f)
                lineTo(21.79f, 13f)
                close()
            }
        }.build()

        return _LeafMaple!!
    }

@Suppress("ObjectPropertyName")
private var _LeafMaple: ImageVector? = null
