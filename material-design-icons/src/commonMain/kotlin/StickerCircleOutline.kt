package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StickerCircleOutline: ImageVector
    get() {
        if (_StickerCircleOutline != null) {
            return _StickerCircleOutline!!
        }
        _StickerCircleOutline = ImageVector.Builder(
            name = "StickerCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.12f, 18.46f)
                lineTo(18.3f, 12.28f)
                curveTo(16.94f, 12.59f, 15.31f, 13.2f, 14.07f, 14.46f)
                curveTo(13.04f, 15.5f, 12.39f, 16.83f, 12.12f, 18.46f)
                moveTo(20.75f, 10f)
                horizontalLineTo(21.05f)
                curveTo(21.44f, 10f, 21.79f, 10.27f, 21.93f, 10.64f)
                curveTo(22.07f, 11f, 22f, 11.43f, 21.7f, 11.71f)
                lineTo(11.7f, 21.71f)
                curveTo(11.5f, 21.9f, 11.26f, 22f, 11f, 22f)
                lineTo(10.64f, 21.93f)
                curveTo(10.27f, 21.79f, 10f, 21.44f, 10f, 21.05f)
                curveTo(9.84f, 17.66f, 10.73f, 14.96f, 12.66f, 13.03f)
                curveTo(15.5f, 10.2f, 19.62f, 10f, 20.75f, 10f)
                moveTo(12f, 2f)
                curveTo(16.5f, 2f, 20.34f, 5f, 21.58f, 9.11f)
                lineTo(20f, 9f)
                horizontalLineTo(19.42f)
                curveTo(18.24f, 6.07f, 15.36f, 4f, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 15.36f, 6.07f, 18.24f, 9f, 19.42f)
                curveTo(8.97f, 20.13f, 9f, 20.85f, 9.11f, 21.57f)
                curveTo(5f, 20.33f, 2f, 16.5f, 2f, 12f)
                curveTo(2f, 6.47f, 6.5f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _StickerCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StickerCircleOutline: ImageVector? = null
