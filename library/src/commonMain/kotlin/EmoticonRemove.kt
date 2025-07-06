package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonRemove: ImageVector
    get() {
        if (_EmoticonRemove != null) {
            return _EmoticonRemove!!
        }
        _EmoticonRemove = ImageVector.Builder(
            name = "EmoticonRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.46f)
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 12.59f, 21.95f, 13.16f, 21.85f, 13.72f)
                curveTo(21f, 13.26f, 20.03f, 13f, 19f, 13f)
                curveTo(17.77f, 13f, 16.63f, 13.37f, 15.68f, 14f)
                horizontalLineTo(6.89f)
                curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12f, 17.5f)
                curveTo(12.42f, 17.5f, 12.83f, 17.45f, 13.23f, 17.36f)
                curveTo(13.08f, 17.88f, 13f, 18.43f, 13f, 19f)
                curveTo(13f, 20.03f, 13.26f, 21f, 13.72f, 21.85f)
                curveTo(13.16f, 21.95f, 12.59f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.47f, 2f, 12f, 2f)
                moveTo(15.5f, 8f)
                curveTo(14.67f, 8f, 14f, 8.67f, 14f, 9.5f)
                curveTo(14f, 10.33f, 14.67f, 11f, 15.5f, 11f)
                curveTo(16.33f, 11f, 17f, 10.33f, 17f, 9.5f)
                curveTo(17f, 8.67f, 16.33f, 8f, 15.5f, 8f)
                moveTo(8.5f, 8f)
                curveTo(7.67f, 8f, 7f, 8.67f, 7f, 9.5f)
                curveTo(7f, 10.33f, 7.67f, 11f, 8.5f, 11f)
                curveTo(9.33f, 11f, 10f, 10.33f, 10f, 9.5f)
                curveTo(10f, 8.67f, 9.33f, 8f, 8.5f, 8f)
                close()
            }
        }.build()

        return _EmoticonRemove!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonRemove: ImageVector? = null
