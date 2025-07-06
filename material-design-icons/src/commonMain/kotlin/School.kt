package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.School: ImageVector
    get() {
        if (_School != null) {
            return _School!!
        }
        _School = ImageVector.Builder(
            name = "School",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(1f, 9f)
                lineTo(12f, 15f)
                lineTo(21f, 10.09f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                moveTo(5f, 13.18f)
                verticalLineTo(17.18f)
                lineTo(12f, 21f)
                lineTo(19f, 17.18f)
                verticalLineTo(13.18f)
                lineTo(12f, 17f)
                lineTo(5f, 13.18f)
                close()
            }
        }.build()

        return _School!!
    }

@Suppress("ObjectPropertyName")
private var _School: ImageVector? = null
