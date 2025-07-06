package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourceRepositoryMultiple: ImageVector
    get() {
        if (_SourceRepositoryMultiple != null) {
            return _SourceRepositoryMultiple!!
        }
        _SourceRepositoryMultiple = ImageVector.Builder(
            name = "SourceRepositoryMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 2f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                moveTo(14.75f, 11.5f)
                curveTo(17.5f, 11.5f, 18.24f, 9.47f, 18.43f, 8.4f)
                curveTo(19.34f, 8.11f, 20f, 7.26f, 20f, 6.25f)
                curveTo(20f, 5f, 19f, 4f, 17.75f, 4f)
                curveTo(16.5f, 4f, 15.5f, 5f, 15.5f, 6.25f)
                curveTo(15.5f, 7.19f, 16.07f, 8f, 16.89f, 8.33f)
                curveTo(16.67f, 9f, 16f, 10f, 14f, 10f)
                curveTo(12.62f, 10f, 11.66f, 10.35f, 11f, 10.84f)
                verticalLineTo(6.87f)
                curveTo(11.87f, 6.56f, 12.5f, 5.73f, 12.5f, 4.75f)
                curveTo(12.5f, 3.5f, 11.5f, 2.5f, 10.25f, 2.5f)
                curveTo(9f, 2.5f, 8f, 3.5f, 8f, 4.75f)
                curveTo(8f, 5.73f, 8.63f, 6.56f, 9.5f, 6.87f)
                verticalLineTo(13.13f)
                curveTo(8.63f, 13.44f, 8f, 14.27f, 8f, 15.25f)
                curveTo(8f, 16.5f, 9f, 17.5f, 10.25f, 17.5f)
                curveTo(11.5f, 17.5f, 12.5f, 16.5f, 12.5f, 15.25f)
                curveTo(12.5f, 14.32f, 11.94f, 13.5f, 11.13f, 13.18f)
                curveTo(11.41f, 12.5f, 12.23f, 11.5f, 14.75f, 11.5f)
                moveTo(10.25f, 14.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 16f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 15.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 14.5f)
                moveTo(10.25f, 4f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 5.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 4.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 4f)
                moveTo(17.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 6.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 7f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 5.5f)
                moveTo(16f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 22f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _SourceRepositoryMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SourceRepositoryMultiple: ImageVector? = null
