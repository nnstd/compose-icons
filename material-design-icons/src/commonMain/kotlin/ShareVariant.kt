package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareVariant: ImageVector
    get() {
        if (_ShareVariant != null) {
            return _ShareVariant!!
        }
        _ShareVariant = ImageVector.Builder(
            name = "ShareVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16.08f)
                curveTo(17.24f, 16.08f, 16.56f, 16.38f, 16.04f, 16.85f)
                lineTo(8.91f, 12.7f)
                curveTo(8.96f, 12.47f, 9f, 12.24f, 9f, 12f)
                curveTo(9f, 11.76f, 8.96f, 11.53f, 8.91f, 11.3f)
                lineTo(15.96f, 7.19f)
                curveTo(16.5f, 7.69f, 17.21f, 8f, 18f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                curveTo(15f, 5.24f, 15.04f, 5.47f, 15.09f, 5.7f)
                lineTo(8.04f, 9.81f)
                curveTo(7.5f, 9.31f, 6.79f, 9f, 6f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15f)
                curveTo(6.79f, 15f, 7.5f, 14.69f, 8.04f, 14.19f)
                lineTo(15.16f, 18.34f)
                curveTo(15.11f, 18.55f, 15.08f, 18.77f, 15.08f, 19f)
                curveTo(15.08f, 20.61f, 16.39f, 21.91f, 18f, 21.91f)
                curveTo(19.61f, 21.91f, 20.92f, 20.61f, 20.92f, 19f)
                arcTo(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.08f)
                close()
            }
        }.build()

        return _ShareVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ShareVariant: ImageVector? = null
