package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Post: ImageVector
    get() {
        if (_Post != null) {
            return _Post!!
        }
        _Post = ImageVector.Builder(
            name = "Post",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(18f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                moveTo(18f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                moveTo(18f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Post!!
    }

@Suppress("ObjectPropertyName")
private var _Post: ImageVector? = null
