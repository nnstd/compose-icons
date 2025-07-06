package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowExpandDown: ImageVector
    get() {
        if (_ArrowExpandDown != null) {
            return _ArrowExpandDown!!
        }
        _ArrowExpandDown = ImageVector.Builder(
            name = "ArrowExpandDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(18.17f)
                lineTo(5.5f, 12.67f)
                lineTo(4.08f, 14.08f)
                lineTo(12f, 22f)
                lineTo(19.92f, 14.08f)
                lineTo(18.5f, 12.67f)
                lineTo(13f, 18.17f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ArrowExpandDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowExpandDown: ImageVector? = null
