package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardMultiple: ImageVector
    get() {
        if (_CardMultiple != null) {
            return _CardMultiple!!
        }
        _CardMultiple = ImageVector.Builder(
            name = "CardMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                curveTo(21.53f, 3f, 22.04f, 3.21f, 22.41f, 3.59f)
                curveTo(22.79f, 3.96f, 23f, 4.47f, 23f, 5f)
                verticalLineTo(15f)
                curveTo(23f, 15.53f, 22.79f, 16.04f, 22.41f, 16.41f)
                curveTo(22.04f, 16.79f, 21.53f, 17f, 21f, 17f)
                horizontalLineTo(7f)
                curveTo(6.47f, 17f, 5.96f, 16.79f, 5.59f, 16.41f)
                curveTo(5.21f, 16.04f, 5f, 15.53f, 5f, 15f)
                verticalLineTo(5f)
                curveTo(5f, 4.47f, 5.21f, 3.96f, 5.59f, 3.59f)
                curveTo(5.96f, 3.21f, 6.47f, 3f, 7f, 3f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                curveTo(2.47f, 21f, 1.96f, 20.79f, 1.59f, 20.41f)
                curveTo(1.21f, 20.04f, 1f, 19.53f, 1f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _CardMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CardMultiple: ImageVector? = null
