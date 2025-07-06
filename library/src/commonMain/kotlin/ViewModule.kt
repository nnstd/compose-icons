package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewModule: ImageVector
    get() {
        if (_ViewModule != null) {
            return _ViewModule!!
        }
        _ViewModule = ImageVector.Builder(
            name = "ViewModule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(10f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(16f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(10f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                moveTo(4f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                moveTo(4f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ViewModule!!
    }

@Suppress("ObjectPropertyName")
private var _ViewModule: ImageVector? = null
