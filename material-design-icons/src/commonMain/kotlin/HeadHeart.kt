package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadHeart: ImageVector
    get() {
        if (_HeadHeart != null) {
            return _HeadHeart!!
        }
        _HeadHeart = ImageVector.Builder(
            name = "HeadHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(17f, 8.83f)
                curveTo(17f, 10.37f, 15.64f, 11.6f, 13.58f, 13.47f)
                lineTo(13f, 14f)
                lineTo(12.42f, 13.47f)
                curveTo(10.36f, 11.6f, 9f, 10.37f, 9f, 8.83f)
                curveTo(9f, 7.63f, 9.96f, 6.64f, 11.16f, 6.63f)
                horizontalLineTo(11.2f)
                curveTo(11.89f, 6.63f, 12.55f, 6.94f, 13f, 7.46f)
                curveTo(13.45f, 6.94f, 14.11f, 6.63f, 14.8f, 6.63f)
                curveTo(16f, 6.62f, 17f, 7.59f, 17f, 8.79f)
                verticalLineTo(8.83f)
                close()
            }
        }.build()

        return _HeadHeart!!
    }

@Suppress("ObjectPropertyName")
private var _HeadHeart: ImageVector? = null
