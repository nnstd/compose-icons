package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCabinet: ImageVector
    get() {
        if (_FileCabinet != null) {
            return _FileCabinet!!
        }
        _FileCabinet = ImageVector.Builder(
            name = "FileCabinet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                moveTo(20f, 4f)
                verticalLineTo(20f)
                curveTo(20f, 21.11f, 19.11f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.11f, 2f, 20f, 2.9f, 20f, 4f)
                moveTo(18f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(18f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(14f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FileCabinet!!
    }

@Suppress("ObjectPropertyName")
private var _FileCabinet: ImageVector? = null
