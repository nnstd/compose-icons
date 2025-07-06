package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandHorizontal: ImageVector
    get() {
        if (_ArrowExpandHorizontal != null) {
            return _ArrowExpandHorizontal!!
        }
        _ArrowExpandHorizontal = ImageVector.Builder(
            name = "ArrowExpandHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                lineTo(19f, 12f)
                lineTo(15f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                lineTo(5f, 12f)
                lineTo(9f, 8f)
                verticalLineTo(11f)
                moveTo(2f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                moveTo(20f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowExpandHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandHorizontal: ImageVector? = null
