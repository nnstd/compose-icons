package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wall: ImageVector
    get() {
        if (_Wall != null) {
            return _Wall!!
        }
        _Wall = ImageVector.Builder(
            name = "Wall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(2f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(16f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                moveTo(13f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                moveTo(3f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(12f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Wall!!
    }

@Suppress("ObjectPropertyName")
private var _Wall: ImageVector? = null
