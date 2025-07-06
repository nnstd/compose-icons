package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RenameBox: ImageVector
    get() {
        if (_RenameBox != null) {
            return _RenameBox!!
        }
        _RenameBox = ImageVector.Builder(
            name = "RenameBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 17f)
                horizontalLineTo(10.5f)
                lineTo(12.5f, 15f)
                horizontalLineTo(18f)
                moveTo(6f, 17f)
                verticalLineTo(14.5f)
                lineTo(13.88f, 6.65f)
                curveTo(14.07f, 6.45f, 14.39f, 6.45f, 14.59f, 6.65f)
                lineTo(16.35f, 8.41f)
                curveTo(16.55f, 8.61f, 16.55f, 8.92f, 16.35f, 9.12f)
                lineTo(8.47f, 17f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _RenameBox!!
    }

@Suppress("ObjectPropertyName")
private var _RenameBox: ImageVector? = null
