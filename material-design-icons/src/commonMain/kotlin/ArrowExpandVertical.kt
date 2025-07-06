package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandVertical: ImageVector
    get() {
        if (_ArrowExpandVertical != null) {
            return _ArrowExpandVertical!!
        }
        _ArrowExpandVertical = ImageVector.Builder(
            name = "ArrowExpandVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                lineTo(12f, 19f)
                lineTo(8f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                lineTo(12f, 5f)
                lineTo(16f, 9f)
                horizontalLineTo(13f)
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowExpandVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandVertical: ImageVector? = null
