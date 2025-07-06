package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Airbag: ImageVector
    get() {
        if (_Airbag != null) {
            return _Airbag!!
        }
        _Airbag = ImageVector.Builder(
            name = "Airbag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                moveTo(10.46f, 15.55f)
                lineTo(13f, 18.03f)
                lineTo(11f, 18.05f)
                lineTo(7.5f, 21.58f)
                lineTo(6f, 20.09f)
                lineTo(10.46f, 15.55f)
                moveTo(17f, 2f)
                curveTo(18.08f, 2f, 19f, 2.88f, 19f, 4f)
                curveTo(19f, 5.08f, 18.12f, 6f, 17f, 6f)
                curveTo(15.92f, 6f, 15f, 5.12f, 15f, 4f)
                curveTo(15f, 2.92f, 15.89f, 2f, 17f, 2f)
                moveTo(14.41f, 15f)
                horizontalLineTo(11.59f)
                lineTo(17.29f, 20.71f)
                lineTo(18.71f, 19.29f)
                lineTo(14.41f, 15f)
                moveTo(15.12f, 14.29f)
                lineTo(19.41f, 18.59f)
                lineTo(19.63f, 18.8f)
                curveTo(19.86f, 18.42f, 20f, 18f, 20f, 17.5f)
                verticalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9.5f)
                verticalLineTo(14.17f)
                lineTo(15.12f, 14.29f)
                close()
            }
        }.build()

        return _Airbag!!
    }

@Suppress("ObjectPropertyName")
private var _Airbag: ImageVector? = null
