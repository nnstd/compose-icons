package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileKeyOutline: ImageVector
    get() {
        if (_FileKeyOutline != null) {
            return _FileKeyOutline!!
        }
        _FileKeyOutline = ImageVector.Builder(
            name = "FileKeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(12.83f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.83f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(10f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 17f)
                close()
            }
        }.build()

        return _FileKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileKeyOutline: ImageVector? = null
