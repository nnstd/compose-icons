package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingDiamondMultiple: ImageVector
    get() {
        if (_CardsPlayingDiamondMultiple != null) {
            return _CardsPlayingDiamondMultiple!!
        }
        _CardsPlayingDiamondMultiple = ImageVector.Builder(
            name = "CardsPlayingDiamondMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(22f)
                curveTo(3f, 23.1f, 3.9f, 24f, 5f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(19f, 0f)
                horizontalLineTo(9f)
                curveTo(7.9f, 0f, 7f, 0.9f, 7f, 2f)
                verticalLineTo(18f)
                curveTo(7f, 19.1f, 7.9f, 20f, 9f, 20f)
                horizontalLineTo(19f)
                curveTo(20.1f, 20f, 21f, 19.1f, 21f, 18f)
                verticalLineTo(2f)
                curveTo(21f, 0.9f, 20.1f, 0f, 19f, 0f)
                moveTo(14f, 15f)
                lineTo(11f, 10f)
                lineTo(14f, 5f)
                lineTo(17f, 10f)
                lineTo(14f, 15f)
                close()
            }
        }.build()

        return _CardsPlayingDiamondMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingDiamondMultiple: ImageVector? = null
