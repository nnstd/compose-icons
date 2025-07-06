package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonMinusOutline: ImageVector
    get() {
        if (_EmoticonMinusOutline != null) {
            return _EmoticonMinusOutline!!
        }
        _EmoticonMinusOutline = ImageVector.Builder(
            name = "EmoticonMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                moveTo(12f, 17.5f)
                curveTo(9.67f, 17.5f, 7.69f, 16.04f, 6.89f, 14f)
                horizontalLineTo(15.69f)
                curveTo(14.5f, 14.78f, 13.62f, 15.97f, 13.23f, 17.36f)
                curveTo(12.83f, 17.45f, 12.42f, 17.5f, 12f, 17.5f)
                moveTo(8.5f, 11f)
                curveTo(7.67f, 11f, 7f, 10.33f, 7f, 9.5f)
                curveTo(7f, 8.67f, 7.67f, 8f, 8.5f, 8f)
                curveTo(9.33f, 8f, 10f, 8.67f, 10f, 9.5f)
                curveTo(10f, 10.33f, 9.33f, 11f, 8.5f, 11f)
                moveTo(15.5f, 11f)
                curveTo(14.67f, 11f, 14f, 10.33f, 14f, 9.5f)
                curveTo(14f, 8.67f, 14.67f, 8f, 15.5f, 8f)
                curveTo(16.33f, 8f, 17f, 8.67f, 17f, 9.5f)
                curveTo(17f, 10.33f, 16.33f, 11f, 15.5f, 11f)
                moveTo(12f, 20f)
                lineTo(13.07f, 19.93f)
                curveTo(13.18f, 20.61f, 13.4f, 21.26f, 13.72f, 21.85f)
                curveTo(13.16f, 21.95f, 12.58f, 22f, 12f, 22f)
                curveTo(6.47f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.47f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 12.59f, 21.95f, 13.16f, 21.85f, 13.72f)
                curveTo(21.26f, 13.4f, 20.62f, 13.18f, 19.93f, 13.07f)
                lineTo(20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 16.42f, 7.58f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _EmoticonMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonMinusOutline: ImageVector? = null
