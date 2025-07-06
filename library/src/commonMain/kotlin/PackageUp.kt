package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PackageUp: ImageVector
    get() {
        if (_PackageUp != null) {
            return _PackageUp!!
        }
        _PackageUp = ImageVector.Builder(
            name = "PackageUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.54f, 5.23f)
                curveTo(20.83f, 5.57f, 21f, 6f, 21f, 6.5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(6.5f)
                curveTo(3f, 6f, 3.17f, 5.57f, 3.46f, 5.23f)
                lineTo(4.84f, 3.55f)
                curveTo(5.12f, 3.21f, 5.53f, 3f, 6f, 3f)
                horizontalLineTo(18f)
                curveTo(18.47f, 3f, 18.88f, 3.21f, 19.15f, 3.55f)
                lineTo(20.54f, 5.23f)
                moveTo(5.12f, 5f)
                horizontalLineTo(18.87f)
                lineTo(17.93f, 4f)
                horizontalLineTo(5.93f)
                lineTo(5.12f, 5f)
                moveTo(12f, 9.5f)
                lineTo(6.5f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                lineTo(12f, 9.5f)
                close()
            }
        }.build()

        return _PackageUp!!
    }

@Suppress("ObjectPropertyName")
private var _PackageUp: ImageVector? = null
