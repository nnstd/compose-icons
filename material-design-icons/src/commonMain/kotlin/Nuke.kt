package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Nuke: ImageVector
    get() {
        if (_Nuke != null) {
            return _Nuke!!
        }
        _Nuke = ImageVector.Builder(
            name = "Nuke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.04f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                curveTo(6.53f, 4f, 7.45f, 4.44f, 8.09f, 5.15f)
                curveTo(8.5f, 3.35f, 10.08f, 2f, 12f, 2f)
                curveTo(13.92f, 2f, 15.5f, 3.35f, 15.91f, 5.15f)
                curveTo(16.55f, 4.44f, 17.47f, 4f, 18.5f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 11f)
                horizontalLineTo(14.04f)
                verticalLineTo(12f)
                moveTo(10f, 16.9f)
                verticalLineTo(15.76f)
                horizontalLineTo(5f)
                verticalLineTo(13.76f)
                horizontalLineTo(19f)
                verticalLineTo(15.76f)
                horizontalLineTo(14.04f)
                verticalLineTo(16.92f)
                lineTo(20f, 19.08f)
                curveTo(20.58f, 19.29f, 21f, 19.84f, 21f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 22f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.5f)
                curveTo(3f, 19.84f, 3.42f, 19.29f, 4f, 19.08f)
                lineTo(10f, 16.9f)
                close()
            }
        }.build()

        return _Nuke!!
    }

@Suppress("ObjectPropertyName")
private var _Nuke: ImageVector? = null
