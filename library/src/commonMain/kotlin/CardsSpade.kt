package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsSpade: ImageVector
    get() {
        if (_CardsSpade != null) {
            return _CardsSpade!!
        }
        _CardsSpade = ImageVector.Builder(
            name = "CardsSpade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(9f, 7f, 4f, 9f, 4f, 14f)
                curveTo(4f, 16f, 6f, 18f, 8f, 18f)
                curveTo(9f, 18f, 10f, 18f, 11f, 17f)
                curveTo(11f, 17f, 11.32f, 19f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(13f, 19f, 13f, 17f, 13f, 17f)
                curveTo(14f, 18f, 15f, 18f, 16f, 18f)
                curveTo(18f, 18f, 20f, 16f, 20f, 14f)
                curveTo(20f, 9f, 15f, 7f, 12f, 2f)
                close()
            }
        }.build()

        return _CardsSpade!!
    }

@Suppress("ObjectPropertyName")
private var _CardsSpade: ImageVector? = null
