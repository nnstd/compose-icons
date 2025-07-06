package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCompare: ImageVector
    get() {
        if (_FileCompare != null) {
            return _FileCompare!!
        }
        _FileCompare = ImageVector.Builder(
            name = "FileCompare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(10f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                moveTo(10f, 1f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(23f)
                horizontalLineTo(12f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                moveTo(20f, 8f)
                verticalLineTo(20f)
                curveTo(20f, 21.11f, 19.11f, 22f, 18f, 22f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                lineTo(14f, 4.5f)
                verticalLineTo(2f)
                lineTo(20f, 8f)
                moveTo(16f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(16f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FileCompare!!
    }

@Suppress("ObjectPropertyName")
private var _FileCompare: ImageVector? = null
