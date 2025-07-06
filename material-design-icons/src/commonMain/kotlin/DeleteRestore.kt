package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteRestore: ImageVector
    get() {
        if (_DeleteRestore != null) {
            return _DeleteRestore!!
        }
        _DeleteRestore = ImageVector.Builder(
            name = "DeleteRestore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14f)
                horizontalLineTo(16f)
                lineTo(12f, 10f)
                lineTo(8f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                curveTo(18f, 19.5f, 17.8f, 20f, 17.39f, 20.39f)
                curveTo(17f, 20.8f, 16.5f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(7.5f, 21f, 7f, 20.8f, 6.61f, 20.39f)
                curveTo(6.2f, 20f, 6f, 19.5f, 6f, 19f)
                verticalLineTo(7f)
                moveTo(19f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(8.5f)
                lineTo(9.5f, 3f)
                horizontalLineTo(14.5f)
                lineTo(15.5f, 4f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _DeleteRestore!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteRestore: ImageVector? = null
