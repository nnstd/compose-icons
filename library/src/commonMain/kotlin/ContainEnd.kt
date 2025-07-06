package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContainEnd: ImageVector
    get() {
        if (_ContainEnd != null) {
            return _ContainEnd!!
        }
        _ContainEnd = ImageVector.Builder(
            name = "ContainEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                moveTo(11f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(15f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                moveTo(22f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ContainEnd!!
    }

@Suppress("ObjectPropertyName")
private var _ContainEnd: ImageVector? = null
