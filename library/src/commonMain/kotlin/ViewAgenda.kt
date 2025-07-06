package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewAgenda: ImageVector
    get() {
        if (_ViewAgenda != null) {
            return _ViewAgenda!!
        }
        _ViewAgenda = ImageVector.Builder(
            name = "ViewAgenda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(2.4f, 3f, 2f, 3.4f, 2f, 4f)
                verticalLineTo(10f)
                curveTo(2f, 10.6f, 2.4f, 11f, 3f, 11f)
                horizontalLineTo(21f)
                curveTo(21.6f, 11f, 22f, 10.6f, 22f, 10f)
                verticalLineTo(4f)
                curveTo(22f, 3.4f, 21.6f, 3f, 21f, 3f)
                moveTo(21f, 13f)
                horizontalLineTo(3f)
                curveTo(2.4f, 13f, 2f, 13.4f, 2f, 14f)
                verticalLineTo(20f)
                curveTo(2f, 20.6f, 2.4f, 21f, 3f, 21f)
                horizontalLineTo(21f)
                curveTo(21.6f, 21f, 22f, 20.6f, 22f, 20f)
                verticalLineTo(14f)
                curveTo(22f, 13.4f, 21.6f, 13f, 21f, 13f)
                close()
            }
        }.build()

        return _ViewAgenda!!
    }

@Suppress("ObjectPropertyName")
private var _ViewAgenda: ImageVector? = null
