package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionDrag: ImageVector
    get() {
        if (_SelectionDrag != null) {
            return _SelectionDrag!!
        }
        _SelectionDrag = ImageVector.Builder(
            name = "SelectionDrag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(12f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                moveTo(7f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                moveTo(3f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(3f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                moveTo(9f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                moveTo(15f, 4f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                moveTo(19f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _SelectionDrag!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionDrag: ImageVector? = null
