package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewCompact: ImageVector
    get() {
        if (_ViewCompact != null) {
            return _ViewCompact!!
        }
        _ViewCompact = ImageVector.Builder(
            name = "ViewCompact",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(10f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(3f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ViewCompact!!
    }

@Suppress("ObjectPropertyName")
private var _ViewCompact: ImageVector? = null
