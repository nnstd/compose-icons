package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CursorPointer: ImageVector
    get() {
        if (_CursorPointer != null) {
            return _CursorPointer!!
        }
        _CursorPointer = ImageVector.Builder(
            name = "CursorPointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.75f, 10.19f)
                lineTo(14.38f, 10.32f)
                lineTo(18.55f, 12.4f)
                curveTo(19.25f, 12.63f, 19.71f, 13.32f, 19.65f, 14.06f)
                verticalLineTo(14.19f)
                lineTo(19.65f, 14.32f)
                lineTo(18.75f, 20.44f)
                curveTo(18.69f, 20.87f, 18.5f, 21.27f, 18.15f, 21.55f)
                curveTo(17.84f, 21.85f, 17.43f, 22f, 17f, 22f)
                horizontalLineTo(10.12f)
                curveTo(9.63f, 22f, 9.18f, 21.82f, 8.85f, 21.47f)
                lineTo(2.86f, 15.5f)
                lineTo(3.76f, 14.5f)
                curveTo(4f, 14.25f, 4.38f, 14.11f, 4.74f, 14.13f)
                horizontalLineTo(5.03f)
                lineTo(9f, 15f)
                verticalLineTo(4.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4.5f)
                verticalLineTo(10.19f)
                horizontalLineTo(13.75f)
                close()
            }
        }.build()

        return _CursorPointer!!
    }

@Suppress("ObjectPropertyName")
private var _CursorPointer: ImageVector? = null
