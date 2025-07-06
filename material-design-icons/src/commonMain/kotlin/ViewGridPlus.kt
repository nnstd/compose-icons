package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewGridPlus: ImageVector
    get() {
        if (_ViewGridPlus != null) {
            return _ViewGridPlus!!
        }
        _ViewGridPlus = ImageVector.Builder(
            name = "ViewGridPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                moveTo(3f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                moveTo(3f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(13f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ViewGridPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ViewGridPlus: ImageVector? = null
