package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationVariant: ImageVector
    get() {
        if (_InformationVariant != null) {
            return _InformationVariant!!
        }
        _InformationVariant = ImageVector.Builder(
            name = "InformationVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 4f)
                moveTo(13.14f, 8.77f)
                curveTo(11.95f, 8.87f, 8.7f, 11.46f, 8.7f, 11.46f)
                curveTo(8.5f, 11.61f, 8.56f, 11.6f, 8.72f, 11.88f)
                curveTo(8.88f, 12.15f, 8.86f, 12.17f, 9.05f, 12.04f)
                curveTo(9.25f, 11.91f, 9.58f, 11.7f, 10.13f, 11.36f)
                curveTo(12.25f, 10f, 10.47f, 13.14f, 9.56f, 18.43f)
                curveTo(9.2f, 21.05f, 11.56f, 19.7f, 12.17f, 19.3f)
                curveTo(12.77f, 18.91f, 14.38f, 17.8f, 14.54f, 17.69f)
                curveTo(14.76f, 17.54f, 14.6f, 17.42f, 14.43f, 17.17f)
                curveTo(14.31f, 17f, 14.19f, 17.12f, 14.19f, 17.12f)
                curveTo(13.54f, 17.55f, 12.35f, 18.45f, 12.19f, 17.88f)
                curveTo(12f, 17.31f, 13.22f, 13.4f, 13.89f, 10.71f)
                curveTo(14f, 10.07f, 14.3f, 8.67f, 13.14f, 8.77f)
                close()
            }
        }.build()

        return _InformationVariant!!
    }

@Suppress("ObjectPropertyName")
private var _InformationVariant: ImageVector? = null
