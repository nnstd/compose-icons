package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewComfy: ImageVector
    get() {
        if (_ViewComfy != null) {
            return _ViewComfy!!
        }
        _ViewComfy = ImageVector.Builder(
            name = "ViewComfy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                moveTo(3f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(8f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                moveTo(13f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(8f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(13f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(18f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(3f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(8f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(18f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                moveTo(18f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ViewComfy!!
    }

@Suppress("ObjectPropertyName")
private var _ViewComfy: ImageVector? = null
