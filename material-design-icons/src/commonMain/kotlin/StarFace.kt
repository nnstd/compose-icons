package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFace: ImageVector
    get() {
        if (_StarFace != null) {
            return _StarFace!!
        }
        _StarFace = ImageVector.Builder(
            name = "StarFace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                lineTo(8.42f, 8.06f)
                lineTo(2f, 9.74f)
                lineTo(6.2f, 14.88f)
                lineTo(5.82f, 21.5f)
                lineTo(12f, 19.09f)
                lineTo(18.18f, 21.5f)
                lineTo(17.8f, 14.88f)
                lineTo(22f, 9.74f)
                lineTo(15.58f, 8.06f)
                lineTo(12f, 2.5f)
                moveTo(9.38f, 10.5f)
                curveTo(10f, 10.5f, 10.5f, 11f, 10.5f, 11.63f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.38f, 12.75f)
                curveTo(8.75f, 12.75f, 8.25f, 12.25f, 8.25f, 11.63f)
                curveTo(8.25f, 11f, 8.75f, 10.5f, 9.38f, 10.5f)
                moveTo(14.63f, 10.5f)
                curveTo(15.25f, 10.5f, 15.75f, 11f, 15.75f, 11.63f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.63f, 12.75f)
                curveTo(14f, 12.75f, 13.5f, 12.25f, 13.5f, 11.63f)
                curveTo(13.5f, 11f, 14f, 10.5f, 14.63f, 10.5f)
                moveTo(9f, 15f)
                horizontalLineTo(15f)
                curveTo(14.5f, 16.21f, 13.31f, 17f, 12f, 17f)
                curveTo(10.69f, 17f, 9.5f, 16.21f, 9f, 15f)
                close()
            }
        }.build()

        return _StarFace!!
    }

@Suppress("ObjectPropertyName")
private var _StarFace: ImageVector? = null
