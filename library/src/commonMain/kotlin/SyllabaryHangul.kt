package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyllabaryHangul: ImageVector
    get() {
        if (_SyllabaryHangul != null) {
            return _SyllabaryHangul!!
        }
        _SyllabaryHangul = ImageVector.Builder(
            name = "SyllabaryHangul",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(6.39f)
                curveTo(5.55f, 8.74f, 5f, 9.8f, 5f, 11f)
                curveTo(5f, 13.2f, 6.8f, 15f, 9f, 15f)
                curveTo(11.2f, 15f, 13f, 13.2f, 13f, 11f)
                curveTo(13f, 9.8f, 12.45f, 8.74f, 11.61f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(15f, 4f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                moveTo(9f, 9f)
                curveTo(10.12f, 9f, 11f, 9.88f, 11f, 11f)
                curveTo(11f, 12.12f, 10.12f, 13f, 9f, 13f)
                curveTo(7.88f, 13f, 7f, 12.12f, 7f, 11f)
                curveTo(7f, 9.88f, 7.88f, 9f, 9f, 9f)
                moveTo(7f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _SyllabaryHangul!!
    }

@Suppress("ObjectPropertyName")
private var _SyllabaryHangul: ImageVector? = null
