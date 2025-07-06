package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookMultiple: ImageVector
    get() {
        if (_NotebookMultiple != null) {
            return _NotebookMultiple!!
        }
        _NotebookMultiple = ImageVector.Builder(
            name = "NotebookMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.05f, 9f)
                horizontalLineTo(7.06f)
                verticalLineTo(6f)
                horizontalLineTo(9.05f)
                verticalLineTo(4.03f)
                horizontalLineTo(7.06f)
                verticalLineTo(3.03f)
                curveTo(7.06f, 1.92f, 7.95f, 1.04f, 9.05f, 1.04f)
                horizontalLineTo(15.03f)
                verticalLineTo(8f)
                lineTo(17.5f, 6.5f)
                lineTo(20f, 8f)
                verticalLineTo(1.04f)
                horizontalLineTo(21f)
                curveTo(22.05f, 1.04f, 23f, 2f, 23f, 3.03f)
                verticalLineTo(17f)
                curveTo(23f, 18.03f, 22.05f, 19f, 21f, 19f)
                horizontalLineTo(9.05f)
                curveTo(8f, 19f, 7.06f, 18.05f, 7.06f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(9.05f)
                verticalLineTo(14f)
                horizontalLineTo(7.06f)
                verticalLineTo(11f)
                horizontalLineTo(9.05f)
                verticalLineTo(9f)
                moveTo(1f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _NotebookMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookMultiple: ImageVector? = null
