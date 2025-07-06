package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorRectangle: ImageVector
    get() {
        if (_VectorRectangle != null) {
            return _VectorRectangle!!
        }
        _VectorRectangle = ImageVector.Builder(
            name = "VectorRectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(16f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(4f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(18f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                moveTo(4f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _VectorRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _VectorRectangle: ImageVector? = null
