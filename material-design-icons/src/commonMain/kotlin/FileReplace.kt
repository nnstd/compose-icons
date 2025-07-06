package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileReplace: ImageVector
    get() {
        if (_FileReplace != null) {
            return _FileReplace!!
        }
        _FileReplace = ImageVector.Builder(
            name = "FileReplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                horizontalLineTo(19.5f)
                lineTo(14f, 6.5f)
                verticalLineTo(12f)
                moveTo(8f, 5f)
                horizontalLineTo(15f)
                lineTo(21f, 11f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 23f)
                horizontalLineTo(8f)
                curveTo(6.89f, 23f, 6f, 22.1f, 6f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                lineTo(15f, 17f)
                lineTo(11f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                moveTo(13.5f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 1f)
                horizontalLineTo(11.5f)
                lineTo(13.5f, 3f)
                close()
            }
        }.build()

        return _FileReplace!!
    }

@Suppress("ObjectPropertyName")
private var _FileReplace: ImageVector? = null
