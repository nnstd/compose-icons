package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FacebookGaming: ImageVector
    get() {
        if (_FacebookGaming != null) {
            return _FacebookGaming!!
        }
        _FacebookGaming = ImageVector.Builder(
            name = "FacebookGaming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                lineTo(21f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _FacebookGaming!!
    }

@Suppress("ObjectPropertyName")
private var _FacebookGaming: ImageVector? = null
