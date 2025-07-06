package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketIt: ImageVector
    get() {
        if (_PowerSocketIt != null) {
            return _PowerSocketIt!!
        }
        _PowerSocketIt = ImageVector.Builder(
            name = "PowerSocketIt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 16.5f)
                curveTo(10.5f, 15.68f, 11.17f, 15f, 12f, 15f)
                curveTo(12.83f, 15f, 13.5f, 15.68f, 13.5f, 16.5f)
                curveTo(13.5f, 17.34f, 12.83f, 18f, 12f, 18f)
                curveTo(11.17f, 18f, 10.5f, 17.34f, 10.5f, 16.5f)
                moveTo(10.5f, 7.5f)
                curveTo(10.5f, 6.67f, 11.17f, 6f, 12f, 6f)
                curveTo(12.83f, 6f, 13.5f, 6.67f, 13.5f, 7.5f)
                curveTo(13.5f, 8.33f, 12.83f, 9f, 12f, 9f)
                curveTo(11.17f, 9f, 10.5f, 8.33f, 10.5f, 7.5f)
                moveTo(4.22f, 2f)
                horizontalLineTo(19.78f)
                curveTo(21f, 2f, 22f, 3f, 22f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(22f, 21f, 21f, 22f, 19.78f, 22f)
                horizontalLineTo(4.22f)
                curveTo(3f, 22f, 2f, 21f, 2f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(2f, 3f, 3f, 2f, 4.22f, 2f)
                moveTo(12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 16.42f, 7.58f, 20f, 12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                moveTo(10.5f, 12f)
                curveTo(10.5f, 11.17f, 11.17f, 10.5f, 12f, 10.5f)
                curveTo(12.83f, 10.5f, 13.5f, 11.17f, 13.5f, 12f)
                curveTo(13.5f, 12.83f, 12.83f, 13.5f, 12f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12f)
                close()
            }
        }.build()

        return _PowerSocketIt!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketIt: ImageVector? = null
