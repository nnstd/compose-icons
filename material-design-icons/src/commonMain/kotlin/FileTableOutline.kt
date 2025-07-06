package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTableOutline: ImageVector
    get() {
        if (_FileTableOutline != null) {
            return _FileTableOutline!!
        }
        _FileTableOutline = ImageVector.Builder(
            name = "FileTableOutline",
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
                verticalLineTo(20f)
                moveTo(10f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                moveTo(14f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                moveTo(10f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                moveTo(14f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(10f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(14f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FileTableOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileTableOutline: ImageVector? = null
