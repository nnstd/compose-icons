package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Chip: ImageVector
    get() {
        if (_Chip != null) {
            return _Chip!!
        }
        _Chip = ImageVector.Builder(
            name = "Chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(11f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(13f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(15f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Chip!!
    }

@Suppress("ObjectPropertyName")
private var _Chip: ImageVector? = null
