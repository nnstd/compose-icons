package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsClub: ImageVector
    get() {
        if (_CardsClub != null) {
            return _CardsClub!!
        }
        _CardsClub = ImageVector.Builder(
            name = "CardsClub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(14.3f, 2f, 16.3f, 4f, 16.3f, 6.2f)
                curveTo(16.21f, 8.77f, 14.34f, 9.83f, 14.04f, 10f)
                curveTo(15.04f, 9.5f, 16.5f, 9.5f, 16.5f, 9.5f)
                curveTo(19f, 9.5f, 21f, 11.3f, 21f, 13.8f)
                curveTo(21f, 16.3f, 19f, 18f, 16.5f, 18f)
                curveTo(16.5f, 18f, 15f, 18f, 13f, 17f)
                curveTo(13f, 17f, 12.7f, 19f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(11.3f, 19f, 11f, 17f, 11f, 17f)
                curveTo(9f, 18f, 7.5f, 18f, 7.5f, 18f)
                curveTo(5f, 18f, 3f, 16.3f, 3f, 13.8f)
                curveTo(3f, 11.3f, 5f, 9.5f, 7.5f, 9.5f)
                curveTo(7.5f, 9.5f, 8.96f, 9.5f, 9.96f, 10f)
                curveTo(9.66f, 9.83f, 7.79f, 8.77f, 7.7f, 6.2f)
                curveTo(7.7f, 4f, 9.7f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _CardsClub!!
    }

@Suppress("ObjectPropertyName")
private var _CardsClub: ImageVector? = null
