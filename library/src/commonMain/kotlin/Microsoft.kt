package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Microsoft: ImageVector
    get() {
        if (_Microsoft != null) {
            return _Microsoft!!
        }
        _Microsoft = ImageVector.Builder(
            name = "Microsoft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                moveTo(11f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(21f, 3f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                moveTo(21f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _Microsoft!!
    }

@Suppress("ObjectPropertyName")
private var _Microsoft: ImageVector? = null
