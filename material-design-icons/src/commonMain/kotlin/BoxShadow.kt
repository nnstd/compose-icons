package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoxShadow: ImageVector
    get() {
        if (_BoxShadow != null) {
            return _BoxShadow!!
        }
        _BoxShadow = ImageVector.Builder(
            name = "BoxShadow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(19f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(19f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(19f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(19f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(16f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(10f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(7f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BoxShadow!!
    }

@Suppress("ObjectPropertyName")
private var _BoxShadow: ImageVector? = null
