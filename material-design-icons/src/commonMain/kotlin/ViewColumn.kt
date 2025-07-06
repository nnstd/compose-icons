package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewColumn: ImageVector
    get() {
        if (_ViewColumn != null) {
            return _ViewColumn!!
        }
        _ViewColumn = ImageVector.Builder(
            name = "ViewColumn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(4f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(10f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ViewColumn!!
    }

@Suppress("ObjectPropertyName")
private var _ViewColumn: ImageVector? = null
